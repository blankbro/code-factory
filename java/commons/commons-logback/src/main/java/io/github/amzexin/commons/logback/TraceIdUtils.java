package io.github.amzexin.commons.logback;

import org.slf4j.MDC;

import java.util.UUID;

/**
 * Description: TraceIdUtils
 *
 * @author Lizexin
 */
public class TraceIdUtils {

    private static String TRACE_ID_KEY = "trace_id";

    public static void setTraceIdKey(String traceIdKey) {
        TraceIdUtils.TRACE_ID_KEY = traceIdKey;
    }

    public static String getTraceIdKey() {
        return TraceIdUtils.TRACE_ID_KEY;
    }

    /**
     * 设置traceId
     */
    public static String setupTraceId() {
        return setupTraceId(null);
    }

    /**
     * 设置traceId
     */
    public static String setupTraceId(String traceId) {
        if (traceId == null || traceId.isEmpty()) {
            traceId = UUID.randomUUID().toString().replaceAll("-", "");
        }
        MDC.put(TRACE_ID_KEY, traceId);
        return traceId;
    }

    /**
     * 获取traceId
     */
    public static String getTraceId() {
        return MDC.get(TRACE_ID_KEY);
    }

    /**
     * 清空traceId
     */
    public static void clearTraceId() {
        MDC.remove(TRACE_ID_KEY);
    }

    private TraceIdUtils() {
    }
}