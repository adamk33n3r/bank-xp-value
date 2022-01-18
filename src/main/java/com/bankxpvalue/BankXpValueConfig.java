package com.bankxpvalue;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(BankXpValuePlugin.CONFIG_GROUP)
public interface BankXpValueConfig extends Config{
    @ConfigItem(
            position = 1,
            keyName = "tutorial",
            name = "Show tutorial",
            description = "Shows a tutorial overlay that explains how to use the plugin"
    )
    default boolean showTutorial(){
        return true;
    }

    @ConfigItem(
            keyName = "tutorial",
            name = "",
            description = ""
    )
    void setTutorial(boolean tutorial);

    @ConfigItem(
            position = 2,
            keyName = "resetToCenter",
            name = "Reset overlay to center",
            description = "Resets the overlay to the center of the bank window when shown"
    )
    default boolean resetToCenter(){
        return false;
    }

    @ConfigItem(
            position = 3,
            keyName = "includeSeedVault",
            name = "Include seed vault",
            description = "Includes items in your seed vault"
    )
    default boolean includeSeedVault(){
        return true;
    }

    @ConfigItem(
            position = 4,
            keyName = "itemXpTooltips",
            name = "Show item xp tooltips",
            description = "Displays a tooltip containing the xp of an item stack"
    )
    default boolean showItemXpTooltips(){
        return true;
    }

    @ConfigItem(
            position = 5,
            keyName = "levelUps",
            name = "Show available level-ups",
            description = "Skill-bar tooltips include number of available level-ups"
    )
    default boolean potentialLevels(){
        return true;
    }
}
