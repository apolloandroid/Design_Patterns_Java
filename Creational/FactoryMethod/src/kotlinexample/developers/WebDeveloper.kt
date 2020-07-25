package kotlinexample.developers

import kotlinexample.application.WebApplication

class WebDeveloper : Developer() {
    override fun createApplication() = WebApplication()
}