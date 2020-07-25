package jp.techacademy.Date.Yuuya.taskapp

import java.io.Serializable
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

open class Task : RealmObject(), Serializable {

    var title: String = ""      // タイトル
    var contents: String = ""   // 内容
    var category: String = ""
    var date: Date = Date()     // 日時

    // id をプライマリーキーとして設定
    @PrimaryKey
    var id: Int = 0
}
