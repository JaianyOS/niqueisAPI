package com.example.slot.machine.Controllers;

import com.example.slot.machine.Controllers.DTO.SlotMachineResultDTO;
import com.example.slot.machine.service.SlotMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sortittion")
public class SlotMachineController {

    @Autowired
    private SlotMachineService slotMachineService;

    @GetMapping
    public SlotMachineResultDTO slotSymbols() {
        return slotMachineService.playSlotMachine();
    }
}
