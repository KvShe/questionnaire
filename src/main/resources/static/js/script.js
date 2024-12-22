document.addEventListener("DOMContentLoaded", () => {
    const textarea = document.querySelector("textarea");

    textarea.addEventListener("input", () => {
        textarea.style.height = "auto"; // Сброс высоты перед расчетом
        textarea.style.height = `${textarea.scrollHeight}px`; // Установка новой высоты
    });

    console.log("Страница загружена. Форма готова к вводу данных.");
});
