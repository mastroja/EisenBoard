package com.EisenBoard.WebAppDev;

import com.EisenBoard.WebAppDev.dto.TaskDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class weeklyScheduleController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("taskDTO", new TaskDTO());
        return "index";
    }

    @PostMapping("/addTask")
    public String addTask(@ModelAttribute TaskDTO taskDTO) {
        taskDTO.setTaskName(null);
        taskDTO.setDescription(null);
        taskDTO.setTaskDueDate(null);
        taskDTO.setRank(null);
        return "index";
    }


}
