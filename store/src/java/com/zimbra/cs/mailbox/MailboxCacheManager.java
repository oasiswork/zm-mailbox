package com.zimbra.cs.mailbox;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface MailboxCacheManager {

    List<Integer> getMailboxIds();

    Set<String> getAccountIds();

    Set<Map.Entry<String, Integer>> getMailboxIdsByAccountId();

    int getMailboxCount();

    Integer getMailboxKey(String accountId);

    void removeMailboxId(String accountId);

    Object retrieveFromCache(int mailboxId, boolean trackGC, MailboxManager mailboxManager) throws MailServiceException;

    Mailbox cacheMailbox(Mailbox mailbox);

    void cacheMailbox(int mailboxId, MailboxMaintenance maint);

    /**
     * @param mailboxId
     * @return maybe an instance of Mailbox or MailboxMaintenance
     */
    Object getMailbox(int mailboxId);

    void cacheMailbox(int mailboxId, boolean isOpen, boolean isWriteLockRequired);

    void removeMailbox(int mailboxId);

    void cacheAccount(String accountId, int mailboxId);

    int getMailboxCacheSize();

    List<Object> getAllLoadedMailboxes();

    Set<Map.Entry<Integer, Object>> getMailboxesById();

    void clearCache();

}
