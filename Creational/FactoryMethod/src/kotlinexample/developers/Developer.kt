package kotlinexample.developers

import kotlinexample.application.Application

abstract class Developer {
    fun presentApplication() = with(createApplication()) {
        install()
        run()
    }

    protected abstract fun createApplication(): Application
}