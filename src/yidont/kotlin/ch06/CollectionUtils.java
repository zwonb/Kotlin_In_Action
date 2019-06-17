package yidont.kotlin.ch06;

import java.util.List;

/**
 * kotlin 和 java 集合
 *
 * @author zwonb
 * @date 2019/6/17
 */
public class CollectionUtils {

    public static List<String> uppercaseAll(List<String> items) {
        for (int i = 0; i < items.size(); i++) {
            items.set(i, items.get(i).toUpperCase());
        }
        return items;
    }
}
