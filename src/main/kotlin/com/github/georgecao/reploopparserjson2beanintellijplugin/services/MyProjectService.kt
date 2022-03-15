package com.github.georgecao.reploopparserjson2beanintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.georgecao.reploopparserjson2beanintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
