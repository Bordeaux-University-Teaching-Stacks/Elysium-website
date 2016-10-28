package fr.elysium.guilde.website.commons.utils;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;

/**
 * <b>DozerUtils</b> provides non-native functionalities for Dozer
 * 
 * @author Meidi
 *
 */
public final class DozerUtils {

  /**
   * Map a types list into another
   * 
   * @param mapper
   * @param source
   * @param destType
   * @return
   */
  public static <T, U> List<U> map(final Mapper mapper, final List<T> source, final Class<U> destType) {
    final List<U> dest = new ArrayList<U>();
    for (T element : source) {
      if (element == null) {
        continue;
      }
      dest.add(mapper.map(element, destType));
    }
    List<Object> s1 = new ArrayList<Object>();
    s1.add(null);
    dest.removeAll(s1);
    return dest;
  }
}
