package com.github.moyanyijiu.codegenerator.services

import com.intellij.openapi.project.Project
import com.github.moyanyijiu.codegenerator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
