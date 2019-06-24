package yidont.kotlin.ch08;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;

import java.util.ArrayList;
import java.util.List;

/**
 * 说明
 *
 * @author zwonb
 * @date 2019/6/24
 */
public class UsingForEach {

    public static void main(String[] args) {
        List<String> strings = new ArrayList();
        strings.add("42");
        CollectionsKt.forEach(strings, s -> {
            System.out.println(s);
            return Unit.INSTANCE;
        });
    }
}
