package me.andreasmelone.glowingeyes.client.gui.button;

import me.andreasmelone.glowingeyes.client.presets.Preset;
import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;

public class PresetButton extends BigSelectableButton {
    private Preset preset;
    public PresetButton(int x, int y, Preset preset, OnPressPreset onPress) {
        super(x, y, Component.literal(preset.getName()), button -> onPress.onPress((PresetButton) button));
        this.preset = preset;
    }

    public Preset getPreset() {
        return preset;
    }

    public void setPreset(Preset preset) {
        this.preset = preset;
        this.setMessage(Component.literal(preset.getName()));
    }

    @FunctionalInterface
    public interface OnPressPreset {
        void onPress(PresetButton button);
    }
}