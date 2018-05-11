package me.zombie_striker.pluginconstructor;

import java.awt.Color;

import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;

public class FileNameToMaterialUtil {

	@SuppressWarnings("deprecation")
	public static MaterialData getMaterialData(String filename) {
		byte b = 0;
		String m = filename;

		BlockFace facing = null;

		if (filename.equalsIgnoreCase("end_rod") || filename.equalsIgnoreCase("ice")
				|| filename.equalsIgnoreCase("vine") || filename.equalsIgnoreCase("web")
				|| filename.equalsIgnoreCase("CHORUS_PLANT") || filename.equalsIgnoreCase("flower_pot")
				|| filename.equalsIgnoreCase("glass") || filename.equalsIgnoreCase("ladder")
				|| filename.equalsIgnoreCase("iron_trapdoor") || filename.equalsIgnoreCase("TRAP_DOOR")
				|| filename.equalsIgnoreCase("MOB_SPAWNER") || filename.equalsIgnoreCase("WATER")
				|| filename.equalsIgnoreCase("ENDER_PORTAL") || filename.equalsIgnoreCase("ANVIL")
				|| filename.equalsIgnoreCase("LAVA") || filename.equalsIgnoreCase("WATER_LILY")
				|| filename.contains("_door") || filename.equalsIgnoreCase("BEETROOT")
				|| filename.equalsIgnoreCase("BREWING_STAND") || filename.equalsIgnoreCase("carrot")
				|| filename.equalsIgnoreCase("deadbush") || filename.equalsIgnoreCase("DRAGON_EGG")
				|| filename.equalsIgnoreCase("fern") || filename.equalsIgnoreCase("iron_bars")
				|| filename.equalsIgnoreCase("potatoes") || filename.contains("rail_") || filename.contains("_rail")
				|| filename.equalsIgnoreCase("reeds") || filename.equalsIgnoreCase("tourch")
				|| filename.equalsIgnoreCase("redstone_torch") || filename.equalsIgnoreCase("redstone")
				|| filename.equalsIgnoreCase("trip_wire") || filename.equalsIgnoreCase("MONSTER_EGG")
				|| filename.equalsIgnoreCase("LEVER")|| filename.equalsIgnoreCase("BROWN_MUSHROOM")|| filename.equalsIgnoreCase("RED_MUSHROOM")) {
			return null;
		}
		if (Material.matchMaterial(m) == null) {
			// gfdasgdfssgdfgfdsgdsgdfgfgdsfdsgfdgsfgfsdfgfgsgfsfggfd
			if (filename.equalsIgnoreCase("bone_block_side")) {
				m = "BONE_BLOCK";

			} else if (filename.equalsIgnoreCase("pumpkin_face_on")) {
				m = "JACK_O_LANTERN";
				facing = BlockFace.EAST;
			} else if (filename.equalsIgnoreCase("pumpkin_face")) {
				m = "PUMPKIN";
				facing = BlockFace.EAST;
			} else if (filename.equalsIgnoreCase("cobblestone_mossy")) {
				m = "MOSSY_COBBLESTONE";
			} else if (filename.equalsIgnoreCase("pumpkin_side")) {
				m = "PUMPKIN";
				facing = BlockFace.WEST;
			} else if (filename.equalsIgnoreCase("dispenser_front")) {
				m = "DISPENCER";
				facing = BlockFace.EAST;
			} else if (filename.equalsIgnoreCase("furnace_front")) {
				m = "FURNACE";
				facing = BlockFace.EAST;
			} else if (filename.equalsIgnoreCase("furnace_front_on")) {
				m = "BURNING_FURNACE";
				facing = BlockFace.EAST;
			} else if (filename.equalsIgnoreCase("observer_back")) {
				m = "OBSERVER";
				facing = BlockFace.WEST;
				// } else if (filename.equalsIgnoreCase("observer_top")) {
				// m = "OBSERVER";
			} else if (filename.equalsIgnoreCase("observer_side")) {
				m = "OBSERVER";
				facing = BlockFace.NORTH;
			} else if (filename.equalsIgnoreCase("observer_front")) {
				m = "OBSERVER";
				facing = BlockFace.EAST;
			} else if (filename.equalsIgnoreCase("piston_top")) {
				m = "PISTON_BASE";
				facing = BlockFace.EAST;
			} else if (filename.equalsIgnoreCase("piston_top_sticky")) {
				m = "PISTON_STICKY_BASE";
				facing = BlockFace.EAST;
			} else if (filename.equalsIgnoreCase("piston_bottom")) {
				m = "PISTON_BASE";
				facing = BlockFace.WEST;

			} else if (filename.equalsIgnoreCase("repeating_command_block_front")) {
				m = "COMMAND_REPEATING";
			} else if (filename.equalsIgnoreCase("command_block_front")) {
				m = "COMMAND";
			} else if (filename.equalsIgnoreCase("chain_command_block_front")) {
				m = "COMMAND_CHAIN";
			} else if (filename.equalsIgnoreCase("crafting_table_front")) {
				m = "WORKBENCH";
			} else if (filename.contains("concrete_") && (!filename.contains("powd"))) {
				m = "CONCRETE";
				b = DyeColor.valueOf(filename.split("concrete_")[1].toUpperCase()).getWoolData();

			} else if (filename.equalsIgnoreCase("end_stone")) {
				m = "ENDER_STONE";

			} else if (filename.equalsIgnoreCase("frosted_ice_0")) {
				m = "PACKED_ICE";
			} else if (filename.equalsIgnoreCase("furnace_side")) {
				m = "FURNACE";
			} else if (filename.contains("glazed_terracotta")) {
				try {
					m = filename.split("glazed_terracotta_")[1] + "_glazed_terracotta";
				} catch (Error | Exception e3) {
					try {
						m = Material.matchMaterial(filename).name();
						m.length();
					} catch (Error | Exception er532) {
						m = Material.WHITE_GLAZED_TERRACOTTA.name();
						Bukkit.broadcastMessage("THIS VALUE NEEDS TO BE CORRECTED. == " + filename);
					}
				}
			} else if (filename.contains("hardened_clay_stained")) {
				m = "STAINED_CLAY";
				b = DyeColor.valueOf(filename.split("hardened_clay_stained_")[1].toUpperCase()).getWoolData();
			} else if (filename.equalsIgnoreCase("hardened_clay")) {
				m = "HARD_CLAY";
			} else if (filename.equalsIgnoreCase("hay_block_side")) {
				m = "HAY_BLOCK";
			} else if (filename.contains("log_")) {
				if (filename.contains("stripped")) {

				} else {
					if (filename.contains("big_oak") || filename.contains("acacia")) {
						m = "LOG_2";
						if (filename.contains("acacia")) {
							b = 12;
						} else {
							b = 13;
						}
					} else {
						m = "LOG";
						if (filename.contains("oak")) {
							b = 12;
						} else if (filename.contains("spru")) {
							b = 13;
						} else if (filename.contains("bir")) {
							b = 14;
						} else {
							b = 15;
						}

					}
				}

			} else if (filename.equalsIgnoreCase("melon_side")) {
				m = "MELON_BLOCK";
			} else if (filename.contains("mushroom_block")) {
				m = "HUGE_MUSHROOM_" + (filename.contains("red") ? 1 : 2);
				if (filename.contains("outside"))
					b = 1;
				if ((b != 1 || m.contains("1")) && RGBBlockColor.isVersionHigherThan(1, 12))
					m = "Fail";
			} else if (filename.equalsIgnoreCase("mycelium_side")) {
				m = "MYCEL";
			} else if (filename.equalsIgnoreCase("noteblock")) {
				m = "NOTE_BLOCK";
			} else if (filename.equalsIgnoreCase("piston_side")) {
				m = "PISTON_BASE";
			} else if (filename.contains("planks_")) {
				m = "WOOD";
				if (filename.contains("big_oak")) {
					b = 5;
				} else if (filename.contains("acacia")) {
					b = 4;
				} else if (filename.contains("jungle")) {
					b = 3;
				} else if (filename.contains("birch")) {
					b = 2;
				} else if (filename.contains("spruce")) {
					b = 1;
				}
			} else if (filename.contains("prismarine_")) {
				m = "PRISMARINE";
				if (filename.contains("bricks")) {
					b = 1;
				} else if (filename.contains("dark")) {
					b = 2;
				}
			} else if (filename.equalsIgnoreCase("pumpkin_side")) {
				m = "PUMKIN";
				/*
				 * } else if (filename.equalsIgnoreCase("piston_top_normal")) { m =
				 * "PISTON_BASE"; b=1; } else if
				 * (filename.equalsIgnoreCase("piston_top_STICKY")) { m = "PISTON_STICKY_BASE";
				 * b=1;
				 */
			} else if (filename.equalsIgnoreCase("quartz_block_side")) {
				m = "QUARTZ_BLOCK";
			} else if (filename.equalsIgnoreCase("quartz_block_chiseled")) {
				m = "QUARTZ_BLOCK";
				b = 1;
			} else if (filename.equalsIgnoreCase("quartz_block_lines")) {
				m = "QUARTZ_BLOCK";
				b = 2;
			} else if (filename.equalsIgnoreCase("sandstone_normal")) {
				m = "SANDSTONE";
			} else if (filename.equalsIgnoreCase("red_sandstone_normal")) {
				m = "RED_SANDSTONE";
			} else if (filename.equalsIgnoreCase("redstone_block")) {
				m = "REDstone_block";
			} else if (filename.equalsIgnoreCase("slime")) {
				m = "SLIME_BLOCK";
			} else if (filename.equalsIgnoreCase("snow")) {
				m = "SNOW_BLOCK";
			} else if (filename.equalsIgnoreCase("sponge_wet")) {
				m = "SPONGE";
				b = 1;
			} else if (filename.equalsIgnoreCase("stone_slab_top")) {
				m = "DOUBLE_STEP";
				b = 8;
			} else if (filename.equals("cobblestone")) {
				m = "COBBLESTONE";
			} else if (filename.contains("stonebrick")) {
				m = "SMOOTH_BRICK";
				if (filename.contains("mossy"))
					b = 1;
				if (filename.contains("cracked"))
					b = 2;
				if (filename.contains("carve"))
					b = 3;
			} else if ((!filename.contains("redstone")) && filename.contains("stone") && (!filename.contains("glow"))
					&& (!filename.contains("sandstone")) && (!filename.contains("brick"))) {
				m = "stone";
				if (filename.contains("granite")) {
					b = 1;
				} else if (filename.contains("diorite")) {
					b = 3;
				} else if (filename.contains("andes")) {
					b = 5;
				}

				if (filename.contains("smooth"))
					b += 1;
			} else if (filename.equals("granite")) {
				m = "stone";
				b = 1;
			} else if (filename.equals("andesite")) {
				m = "stone";
				b = 5;
			} else if (filename.equals("diorite")) {
				m = "stone";
				b = 3;
			} else if (filename.contains("polished_")) {
				if (filename.contains("granite")) {
					b = 2;
				} else if (filename.contains("diorite")) {
					b = 4;
				} else if (filename.contains("andes")) {
					b = 6;
				}
			} else if (filename.contains("wool")) {
				m = "WOOL";
				try {
					b = DyeColor.valueOf(filename.split("wool_colored_")[1].toUpperCase()).getWoolData();
				} catch (Error | Exception e54t3r25) {
					try {
						b = DyeColor.valueOf(filename.split("_wool")[0].toUpperCase()).getWoolData();
					} catch (Error | Exception e43) {
						Bukkit.broadcastMessage("THIS VALUE NEEDS TO BE CORRECTED. == " + filename);
						b = 4;

					}
				}

			}
		}
		if (Material.getMaterial(m.toUpperCase()) == null || Material.getMaterial(m.toUpperCase()) == Material.AIR)
			return null;
		return new MaterialData(Material.getMaterial(m.toUpperCase()), b, facing);
	}
}
