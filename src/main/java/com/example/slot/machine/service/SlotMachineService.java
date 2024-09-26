package com.example.slot.machine.service;

import com.example.slot.machine.Controllers.DTO.SlotMachineResultDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class SlotMachineService {

    private Random random = new Random();

    public SlotMachineResultDTO playSlotMachine() {

        Symbols firstSymbol = getRandomSymbol();
        Symbols secondSymbol = getRandomSymbol();
        Symbols thirdSymbol = getRandomSymbol();

        int totalPoints = firstSymbol.getPoints() + secondSymbol.getPoints() + thirdSymbol.getPoints();

        if (firstSymbol == secondSymbol && secondSymbol == thirdSymbol) {
            totalPoints *= 2;
        }
        return new SlotMachineResultDTO(firstSymbol, secondSymbol, thirdSymbol, totalPoints);
    }
    private Symbols getRandomSymbol() {
        Symbols[] symbols = Symbols.values();
        return symbols[random.nextInt(symbols.length)];
    }
}
