package kotlinexample.developers

import kotlinexample.application.MobileApplication

class MobileDeveloper : Developer() {
    override fun createApplication() = MobileApplication()
}