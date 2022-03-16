package org.reploop.plugin.intellij.services

import com.intellij.openapi.project.Project
import org.reploop.plugin.intellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
