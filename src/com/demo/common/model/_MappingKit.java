package com.demo.common.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("address", "addressID", Address.class);
		arp.addMapping("blog", "id", Blog.class);
		arp.addMapping("common", "commonID", Common.class);
		arp.addMapping("detail", "detailID", Detail.class);
		arp.addMapping("item", "itemID", Item.class);
		arp.addMapping("itemdetail", "itemDetailID", Itemdetail.class);
		arp.addMapping("order", "orderID", Order.class);
		arp.addMapping("user", "userID", User.class);
	}
}
