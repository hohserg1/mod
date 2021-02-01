package imnotjahan.mod.danmachi.world.gen.generators;

import imnotjahan.mod.danmachi.util.Reference;
import imnotjahan.mod.danmachi.util.interfaces.IStructure;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;

import java.util.Random;

public class WorldGenStructure extends WorldGenerator implements IStructure
{
    public static String name;

    public WorldGenStructure(String name)
    {
        this.name = name;
    }

    @Override
    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
        generateStructure(worldIn, position);
        return true;
    }

    public static void generateStructure(World world, BlockPos pos)
    {
        MinecraftServer mcServer = world.getMinecraftServer();
        TemplateManager manager = worldServer.getStructureTemplateManager();
        ResourceLocation location = new ResourceLocation(Reference.MODID, name);
        Template template = manager.get(mcServer, location);

        if(template != null)
        {
            IBlockState state = world.getBlockState(pos);
            world.notifyBlockUpdate(pos, state, state, 3);
            template.addBlocksToWorldChunk(world, pos, settings);
        }
    }
}
