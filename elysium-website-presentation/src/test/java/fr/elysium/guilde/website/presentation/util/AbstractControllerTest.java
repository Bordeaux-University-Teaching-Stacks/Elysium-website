package fr.elysium.guilde.website.presentation.util;

import javax.naming.NamingException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mock.jndi.SimpleNamingContextBuilder;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import static org.springframework.test.web.ModelAndViewAssert.assertViewName;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext-presentation-test.xml", 
		"file:src/main/webapp/WEB-INF/spring-servlet.xml",
		"file:src/main/webapp/WEB-INF/securityContext.xml",
		"file:src/main/webapp/WEB-INF/hdiv-config.xml"
})
@WebAppConfiguration
public abstract class AbstractControllerTest {

	private static final String NEWS_SLIDER_NB_NEWS_JNDI_NAME = "news/slider/nbNews";
	private static final String NEWS_SLIDER_NB_NEWS_JNDI_VALUE = "5";

	@Autowired
	@Qualifier("org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter#0")
	protected RequestMappingHandlerAdapter handlerAdapter;
	
	@Autowired
	@Qualifier("org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping#0")
	protected RequestMappingHandlerMapping handlerMapping;

	protected MockHttpServletRequest request;
	protected MockHttpServletResponse response;
	protected final String GET = "GET";
	protected final String POST = "POST";
	
	@BeforeClass
	public static void setUpClass() throws IllegalStateException, NamingException {
		SimpleNamingContextBuilder builder = new SimpleNamingContextBuilder();
		builder.bind(NEWS_SLIDER_NB_NEWS_JNDI_NAME, NEWS_SLIDER_NB_NEWS_JNDI_VALUE);
		builder.activate();
	}

	@Before
	public void setUp() {
		request = new MockHttpServletRequest();
		response = new MockHttpServletResponse();
	}

	protected ModelAndView getResponsePage() throws Exception {
		Object handler = handlerMapping.getHandler(request).getHandler();
		return handlerAdapter.handle(request, response, handler);
	}

	protected void testRoute(String route, String view, String method) throws Exception {
		request.setRequestURI(route);
		request.setMethod(method);
		Object handler = handlerMapping.getHandler(request).getHandler();
		final ModelAndView mav = handlerAdapter.handle(request, response, handler);
		assertViewName(mav, view);
	}

}
