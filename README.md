# Gestión de Kits Modular

**Práctica de Aplicación de Patrones de Diseño en Java**

Este proyecto aborda el desarrollo de un sistema para la gestión de piezas y kits en una empresa de mobiliario modular, poniendo en práctica los conocimientos de modelado UML y diseño orientado a objetos.

---

## 📋 Objetivo de la práctica

- **Analizar** un dominio real: definición de piezas simples y agrupaciones de piezas (kits).  
- **Modelar** la solución con Diagramas de Clases UML, reflejando herencia, relaciones y patrones de diseño.  
- **Implementar** en Java una solución robusta, escalable y mantenible.

---

## 🔍 Descripción de la solución

1. **Elementos Simples** (`modelo`):  
   Clases que representan piezas individuales (por ejemplo, mesa, silla), cada una con un código y un precio.

2. **Kit Compuesto** (`composite`):  
   Un objeto que agrupa elementos simples y otros kits, calculando su precio como la suma de los componentes con un descuento del 10 %.

3. **Construcción Guiada** (`builder`):  
   `KitBuilder` ofrece una API fluida para ensamblar un kit paso a paso, garantizando validaciones antes de crear el objeto final.

4. **Kits Prediseñados** (`factory`):  
   `KitFactory` centraliza la creación de combinaciones estándar (por ejemplo, "Kit Oficina" o "Kit Salón"), manteniendo limpio el código cliente.

5. **Aplicación de Patrones**:  
   - **Composite** para tratar de forma uniforme piezas y kits.  
   - **Builder** para construir objetos complejos con claridad.  
   - **Factory Method** para encapsular configuraciones comunes.

---

## 🎯 Principales entregables

- **Diagrama UML**: especifica la jerarquía de clases y las relaciones, disponible en `docs/diagrams`.  
- **Justificación de Patrones**: documento breve que explica por qué y cómo se aplicaron cada uno de los patrones de diseño.  
- **Código Java**: completamente comentado y organizado por paquetes (`modelo`, `composite`, `builder`, `factory`, `app`).

---

Practica hecha por Mamoun Benboujida.
