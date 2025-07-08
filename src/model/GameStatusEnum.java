package model;

public enum GameStatusEnum {

    NO_STARTED("Não iniciado"),
    INCOMPLETE("Incompleto"),
    COMPLETE("Completo");

    private final String label;

    GameStatusEnum (final String label){
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
