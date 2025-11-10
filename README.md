# Simulación de Aparcamiento con Semaphore 🅿️

Este proyecto utiliza la clase **Semaphore** para gestionar el acceso concurrente a un aparcamiento con plazas limitadas. Elegí `Semaphore` porque permite controlar explícitamente el número de hilos que pueden acceder simultáneamente a un recurso, en este caso, las plazas del aparcamiento.  
A diferencia de `synchronized`, que solo permite exclusión mutua (un hilo a la vez), `Semaphore` ofrece una solución más flexible al permitir varios accesos concurrentes controlados.  
Frente a `wait()`/`notify()`, `Semaphore` simplifica la sincronización al manejar internamente las colas de espera y permisos, reduciendo la complejidad y el riesgo de errores.  
En comparación con `ReentrantLock`, `Semaphore` es más intuitivo para representar recursos contables, como plazas o conexiones, donde el número de accesos simultáneos es relevante.  
En resumen, `Semaphore` proporciona un equilibrio ideal entre **control, claridad y seguridad** en entornos concurrentes.
