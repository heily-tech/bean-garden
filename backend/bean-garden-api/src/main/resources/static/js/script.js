// 파일 이름 표시
const fileInput = document.getElementById("fileInput");
const fileButton = document.getElementById("fileButton");
const fileName = document.getElementById("fileName");


// 커스텀 버튼 누르면 hidden input 실행
fileButton.addEventListener("click", () => {
    fileInput.click();
});

fileInput.addEventListener("change", () => {
    fileName.textContent = fileInput.files.length
        ? "선택된 씨앗: " + fileInput.files[0].name
        : "아직 씨앗이 없어요";
});

// 임시 Bean 리스트
const beans = ["UserService", "OrderService", "BeanGardenCore"];
const beanList = document.getElementById("beanList");

beans.forEach(bean => {
    const li = document.createElement("li");
    li.textContent = "🍃 " + bean;
    beanList.appendChild(li);
});

// 콩 심기 애니메이션
const startBtn = document.getElementById("startBtn");
const status = document.getElementById("status");
const resultSection = document.getElementById("result-section");

startBtn.addEventListener("click", () => {
    resultSection.classList.remove("hidden");
    status.textContent = "🌱 씨앗이 흙 속에서 깨어나는 중...";

    setTimeout(() => {
        status.textContent = "🌿 새싹이 올라오고 있어요...";
    }, 1500);

    setTimeout(() => {
        status.textContent = "🌳 나무가 되었어요!";
    }, 3000);
});
