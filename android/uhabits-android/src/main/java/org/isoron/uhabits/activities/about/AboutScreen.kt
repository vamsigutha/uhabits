/*
 * Copyright (C) 2017 Álinson Santos Xavier <isoron@gmail.com>
 *
 * This file is part of Loop Habit Tracker.
 *
 * Loop Habit Tracker is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * Loop Habit Tracker is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.isoron.uhabits.activities.about

import org.isoron.uhabits.*
import org.isoron.uhabits.core.preferences.*
import org.isoron.uhabits.intents.*
import org.isoron.uhabits.utils.*

class AboutScreen(
        private val activity: AboutActivity,
        private val intents: IntentFactory,
        private val prefs: Preferences,
) {

    private var developerCountdown = 5

    fun showRateAppWebsite() =
            activity.startActivitySafely(intents.rateApp(activity))

    fun showSendFeedbackScreen() =
            activity.startActivitySafely(intents.sendFeedback(activity))

    fun showSourceCodeWebsite() =
            activity.startActivitySafely(intents.viewSourceCode(activity))

    fun showTranslationWebsite() =
            activity.startActivitySafely(intents.helpTranslate(activity))

    fun showPrivacyPolicyWebsite() =
            activity.startActivitySafely(intents.privacyPolicy(activity))

    fun showCodeContributorsWebsite() =
            activity.startActivitySafely(intents.codeContributors(activity))

    fun onPressDeveloperCountdown() {
        developerCountdown--
        if (developerCountdown == 0) {
            prefs.isDeveloper = true
            activity.showMessage(activity.resources.getString(R.string.you_are_now_a_developer))
        }
    }
}