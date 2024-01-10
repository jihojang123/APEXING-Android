package jyotti.apexing.apexing_android.ui.activity.splash

interface SplashUiContract {
    sealed interface SplashUiEffect {
        object GoToAccountActivity : SplashUiEffect

        data class GoToMainActivity(val id: String) : SplashUiEffect

        object ShowNewVersionDialog : SplashUiEffect

        object ShowErrorDialog : SplashUiEffect
    }
}