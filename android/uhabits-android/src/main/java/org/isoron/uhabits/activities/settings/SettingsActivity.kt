/*
 * Copyright (C) 2016 Álinson Santos Xavier <isoron@gmail.com>
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
package org.isoron.uhabits.activities.settings

import android.os.*
import android.view.*
import androidx.appcompat.app.*
import org.isoron.uhabits.*
import org.isoron.uhabits.activities.*
import org.isoron.uhabits.core.models.*
import org.isoron.uhabits.databinding.*
import org.isoron.uhabits.utils.*

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val component = (application as HabitsApplication).component
        AndroidThemeSwitcher(this, component.preferences).apply()

        val binding = SettingsActivityBinding.inflate(LayoutInflater.from(this))
        binding.root.setupToolbar(
                toolbar = binding.toolbar,
                title = resources.getString(R.string.settings),
                color = PaletteColor(11),
        )
        setContentView(binding.root)
    }
}