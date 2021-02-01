package imnotjahan.mod.danmachi.command;

import com.google.common.collect.ImmutableList;
import imnotjahan.mod.danmachi.capabilities.Status;
import imnotjahan.mod.danmachi.capabilities.StatusProvider;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;

import java.util.List;

public class CommandSet extends CommandBase {
    @Override
    public String getName() {
        return "capa_set";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "/capa_set";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        if (sender instanceof EntityPlayerMP && args.length > 0)
            ((EntityPlayerMP) sender).getCapability(StatusProvider.STATUS_CAP, Status.capSide).set(0, Integer.parseInt(args[0]));
    }

    @Override
    public List<String> getAliases() {
        return ImmutableList.of("capa_set");
    }
}
