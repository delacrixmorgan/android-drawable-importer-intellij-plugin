package de.mprengemann.intellij.plugin.androidicons.util;

import java.util.Collection;

public class StringUtils {
    public static String join(Collection<?> collection, String delimiter) {
        if (collection == null || collection.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        boolean first = true;

        for (Object item : collection) {
            if (!first) {
                sb.append(delimiter);
            } else {
                first = false;
            }

            if (item != null) {
                sb.append(item.toString());
            }
        }

        return sb.toString();
    }
}