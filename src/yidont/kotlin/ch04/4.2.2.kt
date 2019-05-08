package yidont.kotlin.ch04

/**
 * 说明
 * @author zwonb
 * @date 2019/5/8
 */
open class ViewTest {

    constructor(context: String)

    constructor(context: String, attr: Int)

}

class ButtonTest : ViewTest {

    // 调用父类构造函数
    constructor(context: String) : super(context)

    constructor(context: String, attr: Int) : super(context, attr) {}
}

class TextViewTest : ViewTest {

    // 调用当前类的另一个构造函数
    constructor(context: String) : this(context, 0)

    constructor(context: String, attr: Int) : super(context, attr)
}