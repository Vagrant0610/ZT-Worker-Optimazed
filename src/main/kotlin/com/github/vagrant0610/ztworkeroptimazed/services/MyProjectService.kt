package com.github.vagrant0610.ztworkeroptimazed.services

import com.intellij.openapi.project.Project
import com.github.vagrant0610.ztworkeroptimazed.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
