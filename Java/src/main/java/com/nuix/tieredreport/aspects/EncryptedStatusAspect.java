package com.nuix.tieredreport.aspects;

import java.util.Map;

import org.roaringbitmap.RoaringBitmap;

import com.nuix.tieredreport.ItemInfo;
import com.nuix.tieredreport.TieredReportData;

import nuix.Case;
import nuix.Item;
import nuix.Utilities;

/***
 * Item aspect which categorizes items based on the encrypted status, as obtained by calling
 * <a href="https://download.nuix.com/releases/desktop/stable/docs/en/scripting/api/nuix/ItemMetadata.html#isEncrypted--">Item.isEncrypted</a>.
 * @author Jason Wells
 *
 */
public class EncryptedStatusAspect extends AbstractItemAspect {

	@Override
	public String getAspectName() {
		return "Is Encrypted";
	}

	@Override
	public void recordItemValues(Case nuixCase, Utilities utilities, Map<Object, RoaringBitmap> aspectBitmaps, TieredReportData data, Item item, ItemInfo itemInfo) {
		data.recordItemInfoValue(aspectBitmaps, item.isEncrypted(), itemInfo);
	}

}
