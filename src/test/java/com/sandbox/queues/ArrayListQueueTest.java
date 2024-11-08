package com.sandbox.queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    private Queue<Integer> testQueue;

    @BeforeEach
        testQueue = new ArrayListQueue<>();
    }

    @Test
        assertTrue(testQueue.offer(1));
        assertTrue(testQueue.offer(2));
        assertEquals(2, ((ArrayListQueue)testQueue).queue.size());
    }

    @Test
    }

    @Test
    }

    @Test
    }

    @Test
    }

    @Test
    }

    @Test
    }

    @Test
    }
}