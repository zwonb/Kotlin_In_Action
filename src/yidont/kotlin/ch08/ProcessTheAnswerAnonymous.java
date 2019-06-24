package yidont.kotlin.ch08;

import kotlin.jvm.functions.Function1;

import static yidont.kotlin.ch08.ProcessTheAnswer.processTheAnswer;

/**
 * 说明
 *
 * @author zwonb
 * @date 2019/6/24
 */
public class ProcessTheAnswerAnonymous {

    public static void main(String[] args) {
        processTheAnswer(
                new Function1<Integer, Integer>() {
                    @Override
                    public Integer invoke(Integer number) {
                        System.out.println(number);
                        return number + 1;
                    }
                });
    }
}
