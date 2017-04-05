package uia.syslog.we;

import java.util.Locale;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import uia.syslog.we.model.WindowsEvent5446;

public class WindowsEvent5446Test extends WindowsEventTest {

    @Test
    public void testObject() throws Exception {
        String content = "Subject: " +
                "安全性識別碼: S-1-5-18 " +
                "帳戶名稱: NT AUTHORITY/SYSTEM " +
                "處理程序資訊: " +
                "處理程序識別碼: 4 " +
                "提供者資訊: " +
                "識別碼: {D4BD4A0F-7591-4DA2-AE67-3AA97C3C34C2} " +
                "名稱: Symantec IPS Provider " +
                "變更資訊: " +
                "變更類型: 刪除 " +
                "圖說資訊: " +
                "識別碼: {0C30A6A5-E172-4963-97DC-02422CA301C1} " +
                "名稱: Symantec Inbound Transport V4 Callout " +
                "類型: 不持續 " +
                "執行階段識別碼: 259 " +
                "階層資訊: " +
                "識別碼: {5926DFC8-E3CF-4426-A283-DC393F5D0F9D} " +
                "名稱: 輸入傳輸層 v4 " +
                "執行階段識別碼: 12";

        WindowsEvent5446 evt = parse2Object("5446", content, Locale.TAIWAN);
        Assert.assertEquals("5446", evt.getEventId());

        Assert.assertEquals("S-1-5-18", evt.getSecurityId());
        Assert.assertEquals("NT AUTHORITY/SYSTEM", evt.getAccountName());

        Assert.assertEquals("4", evt.getProcessId());

        Assert.assertEquals("{D4BD4A0F-7591-4DA2-AE67-3AA97C3C34C2}", evt.getProviderId());
        Assert.assertEquals("Symantec IPS Provider", evt.getProviderName());

        Assert.assertEquals("刪除", evt.getChangeType());

        Assert.assertEquals("{0C30A6A5-E172-4963-97DC-02422CA301C1}", evt.getCalloutId());
        Assert.assertEquals("Symantec Inbound Transport V4 Callout", evt.getCalloutName());
        Assert.assertEquals("不持續", evt.getCalloutType());
        Assert.assertEquals("259", evt.getCalloutRunTimeId());

        Assert.assertEquals("{5926DFC8-E3CF-4426-A283-DC393F5D0F9D}", evt.getLayerId());
        Assert.assertEquals("輸入傳輸層 v4", evt.getLayerName());
        Assert.assertEquals("12", evt.getLayerRunTimeId());
    }

    @Test
    public void testUS() throws Exception {
        String content = "Subject: " +
                "Security ID: S-1-5-18 " +
                "Account Name: NT AUTHORITY/SYSTEM " +
                "Process Information: " +
                "Process ID: 4 " +
                "Provider Information: " +
                "ID: {D4BD4A0F-7591-4DA2-AE67-3AA97C3C34C2} " +
                "Name: Symantec IPS Provider " +
                "Change Information: " +
                "Change Type: 刪除 " +
                "Callout Information: " +
                "ID: {0C30A6A5-E172-4963-97DC-02422CA301C1} " +
                "Name: Symantec Inbound Transport V4 Callout " +
                "Type: 不持續 " +
                "Run-Time ID: 259 " +
                "Layer Information: " +
                "ID: {5926DFC8-E3CF-4426-A283-DC393F5D0F9D} " +
                "Name: 輸入傳輸層 v4 " +
                "Run-Time ID: 12";

        Assert.assertNotNull(parse2Map("5446", content, Locale.US));
    }

    @Test
    public void testTW() throws Exception {
        String content = "主旨: " +
                "安全性識別碼: S-1-5-18 " +
                "帳戶名稱: NT AUTHORITY/SYSTEM " +
                "處理程序資訊: " +
                "處理程序識別碼: 4 " +
                "提供者資訊: " +
                "識別碼: {D4BD4A0F-7591-4DA2-AE67-3AA97C3C34C2} " +
                "名稱: Symantec IPS Provider " +
                "變更資訊: " +
                "變更類型: 刪除 " +
                "圖說資訊: " +
                "識別碼: {0C30A6A5-E172-4963-97DC-02422CA301C1} " +
                "名稱: Symantec Inbound Transport V4 Callout " +
                "類型: 不持續 " +
                "執行階段識別碼: 259 " +
                "階層資訊: " +
                "識別碼: {5926DFC8-E3CF-4426-A283-DC393F5D0F9D} " +
                "名稱: 輸入傳輸層 v4 " +
                "執行階段識別碼: 12";

        Assert.assertNotNull(parse2Map("5446", content, Locale.TAIWAN));
    }

    @Override
    protected void validate(Map<String, Object> result) {
        Assert.assertEquals(result.get("securityId"), "S-1-5-18");
        Assert.assertEquals(result.get("accountName"), "NT AUTHORITY/SYSTEM");

        Assert.assertEquals(result.get("processId"), "4");

        Assert.assertEquals(result.get("providerId"), "{D4BD4A0F-7591-4DA2-AE67-3AA97C3C34C2}");
        Assert.assertEquals(result.get("providerName"), "Symantec IPS Provider");

        Assert.assertEquals(result.get("changeType"), "刪除");

        Assert.assertEquals(result.get("calloutId"), "{0C30A6A5-E172-4963-97DC-02422CA301C1}");
        Assert.assertEquals(result.get("calloutName"), "Symantec Inbound Transport V4 Callout");
        Assert.assertEquals(result.get("calloutType"), "不持續");
        Assert.assertEquals(result.get("calloutRunTimeId"), "259");

        Assert.assertEquals(result.get("layerId"), "{5926DFC8-E3CF-4426-A283-DC393F5D0F9D}");
        Assert.assertEquals(result.get("layerName"), "輸入傳輸層 v4");
        Assert.assertEquals(result.get("layerRunTimeId"), "12");
    }
}
