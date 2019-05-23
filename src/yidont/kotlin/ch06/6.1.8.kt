package yidont.kotlin.ch06

/**
 * 说明
 * @author zwonb
 * @date 2019/5/23
 */
class MyService {
    fun performAction(): String = "foo"
}

class MyTest {

    private var myService: MyService? = null
    /**
     * 延迟初始化
     */
    private lateinit var myService1: MyService

//    @Before fun setUp() {
//        myService = MyService()
//        myService1 = MyService()
//    }
//
//    @Test fun testAction() {
//        Assert.assertEquals("foo",
//                myService!!.performAction())
//    }

}