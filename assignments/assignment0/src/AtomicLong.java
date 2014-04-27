// Import the necessary Java synchronization and scheduling classes.

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @class AtomicLong
 * @brief This class implements a subset of the
 * java.util.concurrent.atomic.AtomicLong class using a
 * ReentrantReadWriteLock to illustrate how they work.
 */
public class AtomicLong {
    /**
     * The value that's manipulated atomically via the methods.
     */
    private long mValue;

    /**
     * The ReentrantReadWriteLock used to serialize access to mValue.
     */
    private ReentrantReadWriteLock mRWLock = new ReentrantReadWriteLock();

    /**
     * Creates a new AtomicLong with the given initial value.
     */
    public AtomicLong(long initialValue) {
        mValue = initialValue;
    }

    /**
     * @return The current value
     * @brief Gets the current value.
     */
    public long get() {
        long value = 0;

        mRWLock.readLock().lock();

        try {
            value = mValue;
        } finally {
            mRWLock.readLock().unlock();
        }

        return value;
    }

    /**
     * @return the updated value
     * @brief Atomically decrements by one the current value
     */
    public long decrementAndGet() {
        long value = 0;

        mRWLock.writeLock().lock();

        try {
            mValue--;
            value = mValue;
        } finally {
            mRWLock.writeLock().unlock();
        }

        return value;
    }

    /**
     * @return the previous value
     * @brief Atomically increments by one the current value
     */
    public long getAndIncrement() {
        long value = 0;

        mRWLock.writeLock().lock();

        try {
            value = mValue;
            mValue++;
        } finally {
            mRWLock.writeLock().unlock();
        }

        return value;
    }

    /**
     * @return the previous value
     * @brief Atomically decrements by one the current value
     */
    public long getAndDecrement() {
        long value = 0;

        mRWLock.writeLock().lock();

        try {
            value = mValue;
            mValue--;
        } finally {
            mRWLock.writeLock().unlock();
        }

        return value;
    }

    /**
     * @return the updated value
     * @brief Atomically increments by one the current value
     */
    public long incrementAndGet() {
        long value = 0;

        mRWLock.writeLock().lock();

        try {
            mValue++;
            value = mValue;
        } finally {
            mRWLock.writeLock().unlock();
        }

        return value;
    }
}
