package de.codingair.tradesystem.spigot.trade.layout.types.impl.economy.griefdefender;

import de.codingair.tradesystem.spigot.trade.layout.types.impl.economy.EconomyIcon;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class GriefDefenderIcon extends EconomyIcon<ShowGriefDefenderIcon> {
    public GriefDefenderIcon(@NotNull ItemStack itemStack) {
        super(itemStack, "GD Claim Block", "GD Claim Blocks", null /*TODO*/, null /*TODO*/, false);
    }

    @Override
    public Class<ShowGriefDefenderIcon> getTargetClass() {
        return ShowGriefDefenderIcon.class;
    }

    @Override
    public double getPlayerValue(Player player) {
        return (int) 0 /*GriefDefender total amount*/;
    }

    @Override
    public void withdraw(Player player, double value) {
        //decrease in GriefDefender (value will be casted to non-decimal)
    }

    @Override
    public void deposit(Player player, double value) {
        //increase in GriefDefender (value will be casted to non-decimal)
    }
}
