package com.github.afrikanovandrey.testitideaplugin.services

import com.github.afrikanovandrey.testitideaplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
