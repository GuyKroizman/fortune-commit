package com.github.guykroizman.fortunecommit.provider

import com.intellij.openapi.project.Project
import com.intellij.openapi.vcs.changes.LocalChangeList
import com.intellij.openapi.vcs.changes.ui.CommitMessageProvider

class PluginProvider: CommitMessageProvider {
    override fun getCommitMessage(forChangelist: LocalChangeList, project: Project): String? {
        return "fortune"
    }
}