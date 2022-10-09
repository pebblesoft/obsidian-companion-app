package com.pebbles.obsidiancompanion

import androidx.compose.runtime.Composable
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.text.Text

class OCWidget: GlanceAppWidget() {
    @Composable
    override fun Content() {
        Text("hi")
    }

}