/*
 * This file is part of RS3Emulator.
 *
 * RS3Emulator is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * RS3Emulator is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with RS3Emulator.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.ieldor.network.packet.context;

import net.ieldor.network.packet.PacketContext;

/**
 * RS3Emulator
 * WorldListContext.java
 * 16/03/2014
 * @author Im Frizzy : Kyle Friz : <skype:kfriz1998>
 */
public class WorldListContext implements PacketContext {
	
	private int listHash;

	public WorldListContext (int listHash) {
		this.listHash = listHash;
	}
	
	public int getListHash() {
		return listHash;
	}
}
