package yidont.kotlin.ch08

import java.io.BufferedReader
import java.io.FileReader

/**
 * 使用内联 lambda 管理资源 use函数
 *
 * @author zwonb
 * @date 2019/6/25
 */
fun readFirstLineFromFile(path: String): String {
    BufferedReader(FileReader(path).use { br ->
        return br.readText()
    })
    return ""
}
