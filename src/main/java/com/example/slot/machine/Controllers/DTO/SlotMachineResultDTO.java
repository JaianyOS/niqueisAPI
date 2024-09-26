package com.slotmachine.dto;

import com.slotmachine.model.Symbols;

public class SlotMachineResultDTO {

    private Symbols firstSymbol;
    private Symbols secondSymbol;
    private Symbols thirdSymbol;
    private int totalPoints;

    public SlotMachineResultDTO(Symbols firstSymbol, Symbols secondSymbol, Symbols thirdSymbol, int totalPoints) {
        this.firstSymbol = firstSymbol;
        this.secondSymbol = secondSymbol;
        this.thirdSymbol = thirdSymbol;
        this.totalPoints = totalPoints;
    }

    public Symbols getFirstSymbol() {
        return firstSymbol;
    }

    public void setFirstSymbol(Symbols firstSymbol) {
        this.firstSymbol = firstSymbol;
    }

    public Symbols getSecondSymbol() {
        return secondSymbol;
    }

    public void setSecondSymbol(Symbols secondSymbol) {
        this.secondSymbol = secondSymbol;
    }

    public Symbols getThirdSymbol() {
        return thirdSymbol;
    }

    public void setThirdSymbol(Symbols thirdSymbol) {
        this.thirdSymbol = thirdSymbol;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }
}
