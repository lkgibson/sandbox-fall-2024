package com.sandbox.queues;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

    protected List<T> queue;

        queue = new ArrayList<>();
    }

    @Override
            this.queue.add(0, t);
            return false;
        }
        return true;
    }

    @Override
        T returnValue = null;
           returnValue = this.queue.removeLast();
            returnValue = null;
        }
        return returnValue;
    }

    @Override
        T returnValue = null;
            returnValue = this.queue.getLast();
            // return null if the queue is empty
        }
        return returnValue;
    }

    @Override
        return this.queue.isEmpty();
    }

        return this.queue;
    }

    @Override
        final StringBuilder sb = new StringBuilder("ArrayListQueue{");
        sb.append("queue=").append(queue);
        sb.append('}');
        return sb.toString();
    }
}
