package imnotjahan.mod.danmachi.init;

import imnotjahan.mod.danmachi.objects.armor.ArmorBase;
import imnotjahan.mod.danmachi.objects.items.FoodBase;
import imnotjahan.mod.danmachi.objects.items.ItemBase;
import imnotjahan.mod.danmachi.objects.tools.ToolShoot;
import imnotjahan.mod.danmachi.objects.tools.ToolSword;
import imnotjahan.mod.danmachi.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit
{
    public static final List<Item> ITEMS = new ArrayList<>();

    //materials
    public static final Item.ToolMaterial hakugenAloy = EnumHelper.addToolMaterial("hakugen_aloy", 3, 180, 5.0F, 1.0F, 15);
    public static final Item.ToolMaterial hestiaKnifeAloy = EnumHelper.addToolMaterial("hestia_knife_aloy", 3, 100, 5.0F, 2.0F, 30);
    public static final Item.ToolMaterial desperateAloy = EnumHelper.addToolMaterial("desperate_aloy", 3, 200, 5.0F, 4.0F, 10);
    public static final Item.ToolMaterial daggerAloy = EnumHelper.addToolMaterial("dagger_aloy", 2, 100, 5.0F, 1.0F, 10);
    public static final Item.ToolMaterial magicSwordAloy = EnumHelper.addToolMaterial("magic_sword_aloy", 2, 3, 5.0F, 3.0F, 30);
    public static final Item.ToolMaterial greatswordAloy = EnumHelper.addToolMaterial("greatsword_aloy", 2, 180, 5.0F, 3.0F, 10);
    public static final Item.ToolMaterial kotetsuAloy = EnumHelper.addToolMaterial("kotetsu_aloy", 2, 140, 5.0F, 2.0F, 20);
    public static final Item.ToolMaterial protagonistaAloy = EnumHelper.addToolMaterial("protagonista_aloy", 2, 200, 5.0F, 3.0F, 5);
    public static final Item.ToolMaterial urgaAloy = EnumHelper.addToolMaterial("urga_aloy", 2, 200, 5.0F, 6.0F, 5);

    public static final ItemArmor.ArmorMaterial rabbitArmor = EnumHelper.addArmorMaterial("rabbit_armor", Reference.MODID + ":rabbit_armor", 10, new int[]{2, 3, 5, 0}, 15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
    public static final ItemArmor.ArmorMaterial salamanderWool = EnumHelper.addArmorMaterial("salamander_wool_cloak", Reference.MODID + ":salamander_wool", 5, new int[]{0, 0, 2, 0}, 20, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
    public static final ItemArmor.ArmorMaterial hadesHead = EnumHelper.addArmorMaterial("hades_head", Reference.MODID + ":hades_head", 10, new int[]{0, 0, 0, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

    //mob drops
    public static final Item UNICORN_HORN = new ItemBase("unicorn_horn");
    public static final Item GOBLIN_FANG = new ItemBase("goblin_fang");
    public static final Item KOBOLD_NAIL = new ItemBase("kobold_nail");
    public static final Item ALMIRAJ_FUR = new ItemBase("almiraj_fur");
    public static final Item LYGERFANG_FANG = new ItemBase("lygerfang_fang");
    public static final Item LYGERFANG_FUR = new ItemBase("lygerfang_fur");
    public static final Item MINOTAUR_HORN = new ItemBase("minotaur_horn");
    public static final Item MAGIC_STONE = new ItemBase("magic_stone");
    public static final Item SPECIAL_MAGIC_STONE = new ItemBase("special_magic_stone");

    //ingots
    public static final Item ORICHALCUM_INGOT = new ItemBase("orichalcum_ingot");
    public static final Item ADAMANTITE_INGOT = new ItemBase("adamantite_ingot");
    public static final Item MYTHRIL_INGOT = new ItemBase("mythril_ingot");

    //weapons
    //long
    public static final Item FIRE_MAGIC_SWORD = new ToolSword("fire_magic_sword", magicSwordAloy, 1.15f);
    public static final Item ICE_MAGIC_SWORD = new ToolSword("ice_magic_sword", magicSwordAloy, 1.15f);
    public static final Item GREATSWORD = new ToolSword("greatsword", greatswordAloy, 1.15f);
    public static final Item KOTETSU = new ToolSword("kotetsu", kotetsuAloy, 0.9f);
    public static final Item DESPERATE = new ToolSword("desperate", desperateAloy, 0.9f);
    public static final Item KODACHI_FUTABA = new ToolSword("kodachi_futaba", Item.ToolMaterial.IRON, 0.9f);
    public static final Item GREAT_PODAO_ZAGA = new ToolSword("great_podao_zaga", greatswordAloy, 1.1f);
    public static final Item PROTAGONISTA  = new ToolSword("protagonista", protagonistaAloy, 1f);
    public static final Item URGA  = new ToolSword("urga", urgaAloy, 1.15f);
    //short
    public static final Item HAKUGEN = new ToolSword("hakugen", hakugenAloy, 0.5f);
    public static final Item HESTIA_KNIFE = new ToolSword("hestia_knife", hestiaKnifeAloy, 0.8f);
    public static final Item DAGGER = new ToolSword("dagger", daggerAloy, 1);
    public static final Item USHIWAKAMARU = new ToolSword("ushiwakamaru", hakugenAloy, 0.7f);
    //shoots
    public static final Item LITTLE_BALLISTA = new ToolShoot("little_ballista", 400, 1.2f, 1.1f);
    //spears
    public static final Item FORTIA_SPEAR = new ToolSword("fortia_spear", hakugenAloy, 1);

    //armor
    public static final Item RABBIT_ARMOR_CHESTPLATE = new ArmorBase("rabbit_armor_chestplate", rabbitArmor, 1, EntityEquipmentSlot.CHEST);
    public static final Item RABBIT_ARMOR_LEGGINGS = new ArmorBase("rabbit_armor_leggings", rabbitArmor, 2, EntityEquipmentSlot.LEGS);
    public static final Item RABBIT_ARMOR_BOOTS = new ArmorBase("rabbit_armor_boots", rabbitArmor, 1, EntityEquipmentSlot.FEET);

    public static final Item SALAMANDER_WOOL_CLOAK = new ArmorBase("salamander_wool_cloak", salamanderWool, 1, EntityEquipmentSlot.CHEST);

    public static final Item HADES_HEAD = new ArmorBase("hades_head", hadesHead,1, EntityEquipmentSlot.HEAD);

    //food
    public static final Item JAGAMARUKUN = new FoodBase("jagamarukun", 3, false, false);
    public static final Item CRYSTAL_DROP = new FoodBase("crystal_drop", 4, false, false);

    //drinks
    public static final Item SOMA = new FoodBase("soma", 2, false, true);
    public static final Item MERMAID_BLOOD = new FoodBase("mermaid_blood", 2, true, true);

    //other
    public static final Item MORBUL = new ItemBase("morbul");
    public static final Item ICHOR = new ItemBase("ichor");
    public static final Item URGA_BLADE = new ItemBase("urga_blade");
    public static final Item GUIDE_BOOK = new ItemBase("guide_book");
}