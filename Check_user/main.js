document.addEventListener('DOMContentLoaded', function () {
    const excelFileInput = document.getElementById('excelFileInput');
    const alertContainer = document.getElementById('alertContainer');

    excelFileInput.addEventListener('change', function (e) {
        const file = e.target.files[0];

        if (file) {
            readExcel(file);
        }
    });

    function readExcel(file) {
        const reader = new FileReader();

        reader.onload = function (e) {
            const data = new Uint8Array(e.target.result);
            const workbook = XLSX.read(data, { type: 'array' });
            const sheetName = workbook.SheetNames[0];
            const sheet = workbook.Sheets[sheetName];

            if (sheet && sheet['!ref']) {
                // Sheet has data
                alertContainer.style.display = 'none';
            } else {
                // Sheet has no data
                alertContainer.style.display = 'block';
            }
        };

        reader.readAsArrayBuffer(file);
    }
});
