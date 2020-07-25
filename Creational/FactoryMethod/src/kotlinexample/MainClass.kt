package kotlinexample

import kotlinexample.developers.MobileDeveloper
import kotlinexample.developers.WebDeveloper

fun main() {
    val mobileDeveloper = MobileDeveloper()
    val webDeveloper = WebDeveloper()

    mobileDeveloper.presentApplication()
    webDeveloper.presentApplication()
}