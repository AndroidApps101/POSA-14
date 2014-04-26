// Import the necessary Java synchronization and scheduling classes.

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @class AtomicLong
 *
 * @brief This class implements a subset of the
 *        java.util.concurrent.atomic.AtomicLong class using a
 *        ReentrantReadWriteLock to illustrate how they work.
 */
class AtomicLong
{
    /**
     * The value that's manipulated atomically via the methods.
     */
    private long mValue;
    
    /**
     * The ReentrantReadWriteLock used to serialize access to mValue.
     */
    // TODO - replace the null with the appropriate initialization:
    private ReentrantReadWriteLock mRWLock = null;

    /**
     * Creates a new AtomicLong with the given initial value.
     */
    public AtomicLong(long initialValue)
    {
        long value = 0;
        // TODO - you fill in here
    }

    /**
     * @brief Gets the current value.
     * 
     * @return The current value
     */
    public long get()
    {
        long value = 0;
        // TODO - you fill in here, using a readLock()
        return value;
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @return the updated value
     */
    public long decrementAndGet()
    {
        long value = 0;
        // TODO - you fill in here, using a writeLock()
        return value;
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @return the previous value
     */
    public long getAndIncrement()
    {
        long value = 0;
        // TODO - you fill in here, using a writeLock()
        return value;
    }

    /**
     * @brief Atomically decrements by one the current value
     *
     * @return the previous value
     */
    public long getAndDecrement()
    {
        long value = 0;
        // TODO - you fill in here, using a writeLock()
        return value;
    }

    /**
     * @brief Atomically increments by one the current value
     *
     * @return the updated value
     */
    public long incrementAndGet()
    {
        long value = 0;
        // TODO - you fill in here, using a writeLock()
        return value;
    }
}

