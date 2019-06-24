package yidont.kotlin.ch08;

import static yidont.kotlin.ch08.ProcessTheAnswer.processTheAnswer;

/**
 * 说明
 *
 * @author zwonb
 * @date 2019/6/24
 */
public class ProcessTheAnswerLambda {

    public static void main(String[] args) {
        processTheAnswer(number -> number + 1);
    }
}
