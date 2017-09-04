package dao;

import generated.tables.records.ReceiptsRecord;

import org.junit.Test;
import java.math.BigDecimal;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class ReceiptDaoTest {

    @Test
    public void testUnTagOne() {
        ReceiptsRecord receiptsRecord = new ReceiptsRecord(1, null, "merchant", new BigDecimal(1.0), "tag1,tag2,tag3", 1);
        String list = ReceiptDao.removeElementFromReceiptRecordTag(receiptsRecord, "tag2");
        assertEquals("tag1,tag3", list);
    }

    @Test
    public void testUntagAll() {
        ReceiptsRecord receiptsRecord = new ReceiptsRecord(1, null, "merchant", new BigDecimal(1.0), "tag1", 1);
        String list = ReceiptDao.removeElementFromReceiptRecordTag(receiptsRecord, "tag1");
        assertEquals("", list);
    }
}
