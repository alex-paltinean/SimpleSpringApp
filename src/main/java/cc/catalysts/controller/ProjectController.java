package cc.catalysts.controller;

import cc.catalysts.model.Project;
import cc.catalysts.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
@CrossOrigin(origins = "http://localhost:4200")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @GetMapping
    public List<Project> getProjects() {
        return projectService.getProjects();
    }

    @GetMapping("/{projectId}")
    public Project getProject(@PathVariable("projectId") String projectId) {
        return projectService.getProject(projectId);
    }

    @PostMapping
    public Project addProject(@RequestBody Project project) {
        return projectService.save(project);
    }

}
